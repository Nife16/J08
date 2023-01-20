import { useState } from "react"
import LoadingSpinner from "./LoadingSpinner"

const Header = (props) => {


    const showTheRightButtons = () => {


        if (props.user === null) {
            return (
                <div>
                    <a class="header-links" href="/signUp">Sign Up</a>
                    <a class="header-links" href="/">Home</a>
                    <a class="header-links" href="/signIn">Sign In</a>
                </div>
            )
        } else {
            return (
                <div>
                    <button class="header-links" href="/">Sign Out</button>
                    <a class="header-links" href="/">Home</a>
                    <a class="header-links" href="/viewAllStudents">View Students</a>
                </div>
            )
        }
    }

    const renderIsLoading = () => {

        if (props.isLoading) {
            return (
                <LoadingSpinner />
            )
        } else {
            return (
                <div>
                    {showTheRightButtons()}
                </div>
            )
        }

    }

    return (
        <div class="flex-row header">
            {renderIsLoading()}
        </div>
    )

}

export default Header;