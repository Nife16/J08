import React from 'react'

function Modal(props) {
    return (
        <div id="myModal" class="modal">
            <div class="modal-content">
                <span class="close">&times;</span>
                {props.children}
            </div>
        </div>
    )
}

export default Modal