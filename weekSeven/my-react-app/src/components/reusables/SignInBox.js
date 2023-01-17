import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate } from 'react-router'
import '../../css/reusable/sign-up-box.css'
import Button from './Button'

function SignInBox() {

    const navigator = useNavigate()
    const [student, setStudent] = useState({
        studentEmail: "",
        password: ""
    })


    const changeHandler = (event) => {
        const name = event.target.name
        const value = event.target.value
        const tempStudent = { ...student }
        tempStudent[name] = value
        setStudent(tempStudent)
    }

    const submitHandler = (event) => {

        axios.post("http://localhost:8080/signIn", student)
        .then((response) => {
            // Logically do what you gotta do
            const user = response.data
            if(user.isAdmin === true) {
                navigator('/adminPage')
            }
            localStorage.setItem("studentEmail", response.data.studentEmail)
            navigator('/')
        }).catch((e) => {
            console.log(e.response)
        })

    }

    return (
        <div class="box">
            <div class="box-content flex-col margin-center">
                <h1 class="box-header">Sign In</h1>
                <div>
                    <div class="flex-col">
                        <div class="flex-row">
                            <div class="box-input">
                                <input placeholder="Student Email" type="text" onChange={changeHandler} name="studentEmail" value={student.studentEmail} />
                            </div>
                            <div class="arrow">&</div>
                            <div class="box-input">
                                <input placeholder="Password" type="password" onChange={changeHandler} name="password" value={student.password} />
                            </div>
                        </div>
                        <Button className="result-button" onClick={submitHandler} text={"Sign In"} />
                    </div>
                </div>
            </div>
        </div>
    )
}

export default SignInBox