
import styles from './Home.module.css';
import { useNavigate } from 'react-router-dom';

function Home() {
  const navigate = useNavigate();
  
  const onGroupClick = () => {
    navigate("/group?roomId=1");
  }

  const onOneOnOneClick = () => {
    navigate("/one-on-one");
  }

  return (
    <div>
      
      <header className={styles.welcomeMessage}><h1>WELCOME!</h1></header>
      <br/>
      <p className={styles.message}> This is the Anonymous Random Chat Site Version 1.0.0. <br/>
      Please select a way to start a chat : </p><br/>
      <button className={styles.chatTypeButton} onClick={onGroupClick}>GROUP</button>
      <br/>
      <button className={styles.chatTypeButton} onClick={onOneOnOneClick}>ONE-ON-ONE</button>


    </div>
  );
}

export default Home;
