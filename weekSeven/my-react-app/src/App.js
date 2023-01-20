import axios from 'axios';
import { useEffect, useState } from 'react';
import { Routes, Route } from 'react-router-dom'
import Home from './components/pages/Home'
import SignIn from './components/pages/SignIn';
import SignUp from './components/pages/SignUp';
import ViewStundents from './components/pages/ViewStundents';
import Header from './components/reusables/Header';
import PageWrapper from './components/reusables/PageWrapper';

function App() {

  const [user, setUser] = useState(null)
  const [isLoading, setIsLoading] = useState(true)

  useEffect(() => {

    const email = localStorage.getItem("studentEmail")

    if (email !== null) {

      axios.get(`http://localhost:8080/getStudentByEmail/${email}`)
        .then((response) => {

          console.log(response.data)
          setUser(response.data)
          setIsLoading(false)

        })
        .catch((e) => {
          console.log(e)
          setIsLoading(false)
        })
    }
  }, [])

  /* DO SETTING THE USER IN THE APP JS AND PASSING IT AS PROP TO OTHER PAGES FIRST */

  return (
    <PageWrapper user={user} setUser={setUser} isLoading={isLoading} setIsLoading={setIsLoading}>
      <Routes>
        <Route
          exact path='/'
          element={<Home user={user} setUser={setUser} />}
        />
        <Route
          path='/signUp'
          element={<SignUp user={user} setUser={setUser} />}
        />
        <Route
          path='/signIn'
          element={<SignIn user={user} setUser={setUser} />}
        />
        <Route
          path='/viewAllStudents'
          element={<ViewStundents user={user} setUser={setUser} />}
        />
      </Routes>
    </PageWrapper>


  );
}

export default App;