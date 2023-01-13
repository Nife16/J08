import { useState } from 'react';
import Header from '../reusables/Header';
import ImageComponent from '../reusables/ImageComponent';
import MainContent from '../reusables/MainContent';

function Home() {

  // useState variable

  const [user, setUser] = useState({
    email: ""
  })



  const setUseStateVariable = () => {

    setUser({email: "hi im paul"})

  }

  return (
    <div className="App">
      <Header />
      <MainContent>
        {user.email}
        <ImageComponent 
          imageUrl={"https://pyxis.nymag.com/v1/imgs/0f9/f96/029acbf4c6d8c67e138e1eb06a277204bf-05-patrick.rsocial.w1200.jpg"}
         /* height={300}
          width={500} */
          imageClass={"image"}
        /> 
        <button onClick={setUseStateVariable}>CLICK ME</button>
      </MainContent>
    </div>
  );
}

export default Home;