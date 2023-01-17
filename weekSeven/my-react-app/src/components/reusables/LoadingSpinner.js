import React from 'react'
import '../../css/reusable/loading-spinner.css'

function LoadingSpinner() {
    return (
        <div class="newtons-cradle">
            <div class="newtons-cradle__dot"></div>
            <div class="newtons-cradle__dot"></div>
            <div class="newtons-cradle__dot"></div>
            <div class="newtons-cradle__dot"></div>
        </div>
    )
}

export default LoadingSpinner