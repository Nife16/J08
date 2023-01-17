import { Routes, Route } from 'react-router-dom'
import Home from './components/pages/Home'
import SignIn from './components/pages/SignIn';
import SignUp from './components/pages/SignUp';
import ViewStundents from './components/pages/ViewStundents';
import Header from './components/reusables/Header';

function App() {

  /* DO SETTING THE USER IN THE APP JS AND PASSING IT AS PROP TO OTHER PAGES FIRST */

  return (
    <Routes>
      <Route
        exact path='/'
        element={<Home />}
      />
      <Route
        path='/signUp'
        element={<SignUp />}
      />
      <Route
        path='/signIn'
        element={<SignIn />}
      />
      <Route
        path='/viewAllStudents'
        element={<ViewStundents />}
      />
    </Routes>

  );
}

export default App;