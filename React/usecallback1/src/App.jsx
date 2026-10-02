import UserList from './UserList';
import CreateUser from './CreateUser';
import { useCallback, useMemo, useRef } from 'react'
import { useState } from 'react';

function countActiveUsers(users) {
  console.log('활성 사용자 수를 세는중...');
  return users.filter(user => user.active).length;
}

function App() {
  const [inputs, setInputs] = useState({
    username:'',
    email:''
  });
  //키보드로 입력하는 상태를 inputs 라는 객체로 관리
const {username, email} = inputs; //구조분해할당


  const onChange =useCallback( e => {
    const {name, value} = e.target;
      setInputs({
       ...inputs, 
      [name]: value  
    });
  }
  ,[inputs]
);


   const [users , setUsers ] = useState([
    {
      id: 1,
      username: 'velopert',
      email: 'public.velopert@gmail.com',
      active:true
    },
    {
      id: 2,
      username: 'tester',
      email: 'tester@example.com',
      active:true
    },
    {
      id: 3,
      username: 'liz',
      email: 'liz@example.com',
      active:false
    }
  ]);
  const nextId = useRef(4);
  const onCreate = useCallback(() => {
      const user ={
        id:nextId.current, 
        username,
        email
      };

      setUsers([...users, user]);

      setInputs({
        username:'',
        email:''
      });

    nextId.current += 1;
  },[users, username, email]
);

  const onRemove = useCallback(id => {
    setUsers(users.filter(user => user.id !== id));

  },[users]
);

  const onToggle = useCallback(id => {
    setUsers(
      users.map(user =>
        user.id === id ? { ...user, active: !user.active } : user
        // id같은면 active를 변경하고, id가 다르면 기존 user를 그대로 사용
      )
    );
  },[users]
);
  const count = useMemo(()=>countActiveUsers(users),[users])
  return (
    <div>
     <CreateUser 
      username={username} 
      email ={email} 
      onChange={onChange} 
      onCreate={onCreate}
     />
     <UserList users={users} onRemove={onRemove} onToggle={onToggle}/>
     <div>활성사용자 수 : {count}</div>
     </div>
  )
}

export default App