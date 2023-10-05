import { useEffect, useState } from 'react';
import styles from './OnlineUsers.module.css';

function OnlineUsers() {
    let [userList, setUserList] = useState(["최노미", "박또당"]);



    return(
        <div>
            <header className={styles.onlineUserHeader}><h1>Online Users</h1></header>
            <div>
                {
                    userList.map(userName => 
                            <User name={userName}/>
                    )
                }
            </div>
        </div>
    );
}

function User({name}) {
    let userName = name;
    return (
        <p>{userName}</p>
    )
}

export default OnlineUsers;