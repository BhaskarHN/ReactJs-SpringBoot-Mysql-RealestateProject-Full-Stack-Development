
import React, { useState } from 'react';
import axios from 'axios'; 
import '../components/inbox.css';

const InboxForm = () => {
  const [inboxSentMessage, setInboxSentMessage] = useState('');
  const [senderDate, setSenderDate] = useState('');
  const [receiptDate, setReceiptDate] = useState('');
  const [file, setFile] = useState(null);

  const handleSubmit = async (e) => {
    e.preventDefault();

    // Create a FormData object to send the file and form data
    const formData = new FormData();
    formData.append('inboxSent_message', inboxSentMessage);
    formData.append('sender_Date', senderDate);
    formData.append('recipt_Date', receiptDate);
    formData.append('file', file);

    try {
      // Send a POST request to your server
      await axios.post('http://localhost:8080/api/Inboxsentmessage', formData, {
        headers: {
          'Content-Type': 'multipart/form-data',
        },
      });

      // Clear the form after successful submission
      setInboxSentMessage('');
      setSenderDate('');
      setReceiptDate('');
      setFile(null);

      // Display a success message to the user
      alert('Message sent successfully!');
    } catch (error) {
      // Handle any errors here
      console.error('Error sending message:', error);
    }
  };

  return (
    <div class="Inbox">
      <h2>Send Inbox Message</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label htmlFor="inboxSentMessage">Message:</label>
          <textarea
            id="inboxSentMessage"
            value={inboxSentMessage}
            onChange={(e) => setInboxSentMessage(e.target.value)}
          />
        </div>
        <div>
          <label htmlFor="senderDate">Sender Date:</label>
          <input
            type="date"
            id="senderDate"
            value={senderDate}
            onChange={(e) => setSenderDate(e.target.value)}
          />
        </div>
        <div>
          <label htmlFor="receiptDate">Receipt Date:</label>
          <input
            type="date"
            id="receiptDate"
            value={receiptDate}
            onChange={(e) => setReceiptDate(e.target.value)}
          />
        </div>
        <div>
          <label htmlFor="file">Attach File:</label>
          <input
            type="file"
            id="file"
            onChange={(e) => setFile(e.target.files[0])}
          />
        </div>
        <div>
          <button type="submit">Send</button>
        </div>
      </form>
    </div>
  );
};

export default InboxForm;
