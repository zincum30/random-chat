import { useSearchParams } from 'react-router-dom';
import styles from './Group.module.css'
import SplitPane, { Pane } from 'split-pane-react';
import OnlineUsers from '../common/OnlineUsers';
import { useState } from 'react';
import 'split-pane-react/esm/themes/default.css'



function GroupChattingRoom() {

    const [sizes, setSizes] = useState([
        '70%', '30%'
    ])
    const [searchParam, setSearchParam] = useSearchParams();
    const roomId = searchParam.get("roomId");

    return(
    <div className = {styles.groupChattingWrapper}>
        <header className={styles.chattingRoomHeader}>
            <h1>Group{roomId}</h1>
        </header>
        <div className={styles.chattingRoomBody}>
            <SplitPane 
                split='vertical'
                sizes={sizes}
                onChange={setSizes}
                style={{width:'100%', display:'flex'}}>
                <Pane 
                    minSize='70%'
                    maxSize='100%'
                    style={{height:'100%'}}>
                    <div className={styles.chattingMessageArea}/>
                </Pane>
                <OnlineUsers/>
            </SplitPane>
        </div>
        <footer className={styles.chattingSendArea}>
            <textarea className={styles.chattingTextArea} placeholder="Enter text here" id="text"></textarea>
            <button className={styles.chattingSendButton} type="button" id="send">send</button>
        </footer>
    </div>
    );
}

export default GroupChattingRoom;