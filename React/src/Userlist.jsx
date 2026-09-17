import React from "react";
import User from "./user";

function Userlist({users}) {


  return (
    <div>
        {users.map(user =>(
            <User user={user} key={user.id} />
        ))}


    </div>
  );
}

export default Userlist;
