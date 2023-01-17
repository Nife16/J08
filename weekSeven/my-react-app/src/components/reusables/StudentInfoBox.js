import React from 'react'
import '../../css/view-student.css'
import Button from './Button'

function StudentInfoBox(props) {
    return (
        <div className='flex-col student-box'>
            <div>{props.student.firstName}</div>
            <div>{props.student.lastName}</div>
            <div>{props.student.age}</div>
            <div>{props.student.studentEmail}</div>
            <div>{props.student.gender}</div>
            <Button className="result-button" value={props.student.id} onClick={props.onClick} />
        </div>
    )
}

export default StudentInfoBox