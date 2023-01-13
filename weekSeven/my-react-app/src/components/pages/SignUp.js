

import React from 'react'
import Header from '../reusables/Header'
import MainContent from '../reusables/MainContent'
import SignUpBox from '../reusables/SignUpBox'

function SignUp() {
  return (
    <div className='App'>
        <Header />
        <MainContent>
            <SignUpBox />
        </MainContent>
    </div>
  )
}

export default SignUp