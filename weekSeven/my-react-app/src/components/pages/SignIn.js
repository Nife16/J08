

import React from 'react'
import Header from '../reusables/Header'
import MainContent from '../reusables/MainContent'
import SignInBox from '../reusables/SignInBox'

function SignIn() {
  return (
    <div className='App'>
        <Header />
        <MainContent>
            <SignInBox />
        </MainContent>
    </div>
  )
}

export default SignIn