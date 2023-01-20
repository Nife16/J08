

import React from 'react'
import Header from '../reusables/Header'
import MainContent from '../reusables/MainContent'
import SignInBox from '../reusables/SignInBox'

function SignIn(props) {
  return (
    <div className='flex-col'>

      <SignInBox user={props.user} setUser={props.setUser} />

    </div>
  )
}

export default SignIn