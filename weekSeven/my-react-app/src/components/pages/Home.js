import axios from 'axios';
import { useEffect, useState } from 'react';
import Button from '../reusables/Button';
import Header from '../reusables/Header';
import ImageComponent from '../reusables/ImageComponent';
import MainContent from '../reusables/MainContent';

function Home() {

  // useState variable

  const [user, setUser] = useState({})
  const [filters, setFilters] = useState({
    year: null,
    make: null,
    model: null
  })
  
  useEffect(function() {
    const email = localStorage.getItem("studentEmail")

    axios.get(`http://localhost:8080/getStudentByEmail/${email}`)
    .then(function(response) {
        setUser(response.data)
    })
    .catch((e) => {
      console.log(e)
    }) 

  }, [])

  return (
    <div className="App">
      <Header />
      <MainContent>
        {user.studentEmail}
        <ImageComponent 
          imageUrl={"https://pyxis.nymag.com/v1/imgs/0f9/f96/029acbf4c6d8c67e138e1eb06a277204bf-05-patrick.rsocial.w1200.jpg"}
         /* height={300}
          width={500} */
          imageClass={"image"}
        />
      </MainContent>
    </div>
  );
}

export default Home;