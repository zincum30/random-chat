import { Route, BrowserRouter, Routes } from "react-router-dom";
import Home from './components/home/Home';
import GroupChattingRoom from "./components/chatting/group/Group";


function Router() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Home/>}/>
                <Route path="/group" element={<GroupChattingRoom/>}/>
            </Routes>
        </BrowserRouter>
    )
}

export default Router;