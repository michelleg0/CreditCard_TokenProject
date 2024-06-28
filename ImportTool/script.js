/*document.getElementById('csvForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the form from submitting the traditional way

    const fileInput = document.getElementById('csvFile');
    const file = fileInput.files[0]; // Get the file from the input

    if (file) {
        const reader = new FileReader(); // Create a new FileReader

        reader.onload = function(e) {
            const csvContent = e.target.result; // Get the file content
            console.log('CSV Content:', csvContent); // Print the content to the console
            // send the data to the backend
        };

        reader.readAsText(file); // Read the file as text
    } else {
        alert('Please select a CSV file.');
    }
});