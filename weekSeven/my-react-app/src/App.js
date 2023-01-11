import { useState } from 'react';
import Header from './components/reusables/Header';
import ImageComponent from './components/reusables/ImageComponent';
import MainContent from './components/reusables/MainContent';

function App() {

  // useState variable

  const [user, setUser] = useState({
    email: ""
  })


  const setUseStateVariable = () => {

    setUser({email: "hi im paul"})

  }

  return (
    <div className="App flex-col">
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

export default App;
