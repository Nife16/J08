import axios from 'axios';
import { useEffect, useState } from 'react';
import Button from '../reusables/Button';
import Header from '../reusables/Header';
import ImageComponent from '../reusables/ImageComponent';
import MainContent from '../reusables/MainContent';

function Home(props) {

  // useState variable

  const [allUsers, setAllUsers] = useState([])
  const [allSchools, setAllASchools] = useState([])
  const [filters, setFilters] = useState({
    year: null,
    make: null,
    model: null
  })
  
  useEffect(function() {


    axios.get(`http://localhost:8080/viewAllStudents`)
    .then(function(response) {
        setAllUsers(response.data)
    })
    .catch((e) => {
      console.log(e)
    }) 

  }, [])
  
  useEffect(() => {
    axios.get(`http://localhost:8080/getAllSchools`)
    .then(function(response) {
        setAllASchools(response.data)
    })
    .catch((e) => {
      console.log(e)
    }) 
  }, [])

  return (
    <div className='flex-col'>
      {allSchools.map((school) => {
        return <div>{school.schoolName}</div>
      })}
      {allUsers.map((user) => {
        return <div>{user.firstName}</div>
      })}
      
        <ImageComponent 
          imageUrl={"https://pyxis.nymag.com/v1/imgs/0f9/f96/029acbf4c6d8c67e138e1eb06a277204bf-05-patrick.rsocial.w1200.jpg"}
         /* height={300}
          width={500} */
          imageClass={"image"}
        />
    </div>
  );
}

export default Home;