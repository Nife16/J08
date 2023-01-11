import '../../css/reusable/image-component.css'


import React from 'react'

function ImageComponent(props) {
  return (
    <img src={props.imageUrl}  /* height={props.height} width={props.width} */ className={props.imageClass} />
  )
}

export default ImageComponent