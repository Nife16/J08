import axios from 'axios'
import React, { useState } from 'react'
import '../../css/view-student.css'
import Button from './Button'
import Modal from './Modal'

function StudentInfoBox(props) {

    const [isModalShowing, setIsModalShowing] = useState(false)
    const [activeStudent, setActiveStudent] = useState({})

    const toggleModal = () => {

        if(isModalShowing) {
            return (
                <Modal>
                    <div>
                        hi mom
                    </div>
                </Modal>
            )
        } else {
            return (
                null
            )
        }

    }

    const onClicky = (event) => {

        axios.get(`http://localhost:8080/getStudentById/${event.target.id}`)
        .then((response) => {
            setActiveStudent(response.data)
            setIsModalShowing(true)
        })
        

    }

    return (
        <div className='flex-col student-box'>
            <div>{props.student.firstName}</div>
            <div>{props.student.lastName}</div>
            <div>{props.student.age}</div>
            <div>{props.student.studentEmail}</div>
            <div>{props.student.gender}</div>
            <Button id={props.student.id} className="result-button" value={1} onClick={onClicky} />
            {toggleModal()}
        </div>
    )
}

export default StudentInfoBox