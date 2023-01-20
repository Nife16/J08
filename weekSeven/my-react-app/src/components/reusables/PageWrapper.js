import React from 'react'
import Header from './Header'
import MainContent from './MainContent'

function PageWrapper(props) {


    return (
        <div className="App">
            <Header user={props.user} setUser={props.setUser} isLoading={props.isLoading} setIsLoading={props.setIsLoading} />
            <MainContent>
                {props.children}
            </MainContent>
        </div>
    )
}

export default PageWrapper