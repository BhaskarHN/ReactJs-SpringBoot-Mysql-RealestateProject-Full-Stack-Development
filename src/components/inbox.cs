/* Add your custom CSS styles here */
.Inbox {
    display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  height: 100vh; 
  width:212vh;
  }
  
  h2 {
    margin-bottom: 15px;
  }
  
  form {
    display: flex;
    flex-direction: column;
  }
  
  input[type="text"],
  input[type="date"],
  input[type="file"] {
    margin-bottom: 10px;
    padding: 3px;
    border: 1px solid #ccc;
    border-radius: 5px;
    width: 100%; /* Added width */
    box-sizing: border-box; /* Ensures padding is included in width calculation */
  }
  
  button {
    padding: 10px 15px;
    background-color: #007bff;
    color: #fff;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    width: 100%; /* Added width */
    box-sizing: border-box; /* Ensures padding is included in width calculation */
  }
  
  button:hover {
    background-color: #0056b3;
  }
  .Inbox {
    background-image: url('https://img.freepik.com/free-vector/message-sent-concept-illustration_114360-3363.jpg');
    background-size: cover;
    background-position: center;
  }
