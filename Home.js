import {useState,useEffect} from "react";
import db from "./fb";
import { get,ref,child,remove} from "firebase/database";

function Home()
{
 const [info,setInfo]=useState([]);
 useEffect(()=>{
	const dbref=ref(db);
	get(child(dbref,"task/"))
	.then((snapshot)=>{
		if(snapshot.exists()){
			setInfo([]);
			const data = snapshot.val()
			console.log(data);
		if(data!==null){
				Object.values(data).map((da)=>{
				setInfo((oldArray)=>[...oldArray,da]);
				});
				}
			}
			else console.log("No Data");	
		})
	},[])

  const delTask=(id)=>{
			remove(ref(db,"task/"+id))
			.then(()=>{
				alert(" Removed");
				window.location.reload();
				})
			.catch((err)=>console.log(err))
			}
	return(
		<>
		<center>
			<h1>Home Page</h1>
			<table border="4" style={{width:"60%"}}>
			<tr>
			 <th>Id</th>
			 <th>Task</th>
			 <th>Delete</th>
			</tr>
			
			{
			info.map( (e=>
					<tr style={{"text-align":"center"}}>
					<td>{e.id}</td>
					<td>{e.task}</td>
					<td><button onClick={()=>{if(window.confirm('r you sure')) delTask(e.id)}}>Delete</button></td>
					</tr>
			))}
			</table>
		</center>
		</>	
	
);
}
export default Home;