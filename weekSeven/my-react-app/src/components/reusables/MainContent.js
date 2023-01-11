

import React from 'react'

const MainContent = (props) => {


  return (
    <div class="flex-row main-content content-center">
        {props.children}
    </div>
  )
}

export default MainContent