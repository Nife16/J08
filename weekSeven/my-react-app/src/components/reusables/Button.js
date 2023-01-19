import '../../css/reusable/button.css'

import React from 'react'

function Button(props) {
  return (
    <button id={props.id} value={props.value} className={props.className} onClick={props.onClick}>{props.text}</button>
  )
}

export default Button