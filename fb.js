


import { initializeApp } from "firebase/app";
import {getDatabase} from "firebase/database";

const firebaseConfig = {
  apiKey: "AIzaSyCqHya53jtj6T173TlBIGXMkbNgWzzt9VQ",
  authDomain: "task-reactjs-1ad22.firebaseapp.com",
  databaseURL: "https://task-reactjs-1ad22-default-rtdb.firebaseio.com",
  projectId: "task-reactjs-1ad22",
  storageBucket: "task-reactjs-1ad22.appspot.com",
  messagingSenderId: "56563325268",
  appId: "1:56563325268:web:d24105e417e604066510c1"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const db=getDatabase(app);
export default db;