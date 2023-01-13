import axios from 'axios'
import React, { useState } from 'react'
import '../../css/reusable/sign-up-box.css'

function SignInBox() {

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

    const submitHandler = () => {

        

        axios.post("http://localhost:8080/signIn", student)
        .then((response) => {
            // Logically do what you gotta do
            console.log(response.data)
        }).catch((e) => {
            console.log(e)
        })

    }

    return (
        <div class="box">
            <div class="box-content flex-col margin-center">
                <h1 class="box-header">Sign In</h1>
                <form>
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
                        <button class="result-button" onClick={submitHandler}>Submit</button>
                    </div>
                </form>
            </div>
        </div>
    )
}

export default SignInBox