import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import '../../css/reusable/sign-up-box.css'

function SignUpBox() {

    const navigate = useNavigate()
    const [student, setStudent] = useState({
        firstName: "",
        lastName: "",
        age: null,
        password: "",
        coffeeImage: ""
    })


    const changeHandler = (event) => {
        const name = event.target.name
        const value = event.target.value
        const tempStudent = { ...student }
        tempStudent[name] = value
        setStudent(tempStudent)
    }

    const submitHandler = () => {

        const schoolId = 1;

        

        axios.post(`http://localhost:8080/enroll/${schoolId}`, student)
        .then((response) => {
            // Form tag was messing up the navigate, causing query params to show. so dont use form tags!
            navigate("/signIn")
        }).catch((e) => {
            console.log(e)
        })

    }

    return (
        <div class="box">
            <div class="box-content flex-col margin-center">
                <h1 class="box-header">Sign Up, Or ELSE, paul is coming</h1>
                <div>
                    <div class="flex-col">
                        <div class="flex-row">
                            <div class="box-input">
                                <input placeholder="First Name" type="text" onChange={changeHandler} name="firstName" value={student.firstName} />
                            </div>
                            <div class="arrow">&</div>
                            <div class="box-input">
                                <input placeholder="Last Name" type="text" onChange={changeHandler} name="lastName" value={student.lastName} />
                            </div>
                        </div>
                        <div className='flex-row'>
                            <div class="box-input">
                                <input placeholder="Age" type="number" onChange={changeHandler} name="age" value={student.age} />
                            </div>
                            <div class="arrow">&</div>
                            <div class="box-input">
                                <input placeholder="Must have coffee Picture" type="text" onChange={changeHandler} name="coffeeImage" value={student.coffeeImage} />
                            </div>
                        </div>
                        <div className='flex-row'>
                            <div class="box-input">
                                <input placeholder="Password" type="password" onChange={changeHandler} name="password" value={student.password} />
                            </div>
                        </div>
                        <button class="result-button" onClick={submitHandler}>Submit</button>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default SignUpBox