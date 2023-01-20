

import axios from 'axios'
import React, { useEffect, useState } from 'react'
import Header from '../reusables/Header'
import LoadingSpinner from '../reusables/LoadingSpinner'
import MainContent from '../reusables/MainContent'
import '../../css/view-student.css'
import StudentInfoBox from '../reusables/StudentInfoBox'

function ViewStundents() {

    const [allStudents, setAllStudents] = useState([])
    const [isLoading, setIsLoading] = useState(true)

    useEffect(() => {

        axios.get('http://localhost:8080/viewAllStudents')
            .then((response) => {
                setTimeout(() => {
                    setAllStudents(response.data)
                    setIsLoading(false)
                }, 1000)
            })
            .catch((e) => {
                console.log(e)
                setIsLoading(false)
            })
    }, [])


    const renderContent = () => {

        if (isLoading) {
            // render loading spinnder
            return (
                <LoadingSpinner />
            )
        } else {
            return (
                allStudents.map((student) => {
                    return (
                        <StudentInfoBox student={student} />
                    )
                })
            )
        }
    }

    return (
        <div className='flex-col'>
            <div className="out-of-the-box">
                <div className="flex-row flex-wrap">
                    {renderContent()}
                </div>
            </div>
            <div>Hi mom</div>
        </div>
    )
}

export default ViewStundents
