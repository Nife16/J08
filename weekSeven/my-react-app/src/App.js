import { Routes, Route } from 'react-router-dom'
import Home from './components/pages/Home'
import SignIn from './components/pages/SignIn';
import SignUp from './components/pages/SignUp';

function App() {

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
    </Routes>
  );
}

export default App;
