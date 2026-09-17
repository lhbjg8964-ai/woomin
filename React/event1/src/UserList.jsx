import User from "./User";

function UserList({ users, onRemove, onToggle }) {
  return (
    <div>
      {users.map((user) => (
        <User
          user={user}
          key={user.id}
          onRemove={onRemove}
          onToggle={onToggle}
        />
        // onRemove함수는 UserList 에서도 전달을 받을 것이며
        // User컴포넌트에게 전달
      ))}
    </div>
  );
}

export default UserList;
