// Fetch the dropdown data when the page loads
window.onload = async function fetchDropdownData() {
    try {
        // Fetch the application names
        const applicationsRes = await axios.get('/api/applications');
        console.log(applicationsRes);
        const applicationDropdown = document.getElementById('applicationDropdown');
        applicationsRes.data.forEach(app => {
            let option = document.createElement('option');
            option.value = app;
            option.text = app;
            applicationDropdown.add(option);
        });

        // Fetch the IP/hostnames
        const ipRes = await axios.get('/api/ip-or-hostnames');
        console.log(ipRes);
        const ipDropdown = document.getElementById('ipDropdown');
        ipRes.data.forEach(ip => {
            let option = document.createElement('option');
            option.value = ip;
            option.text = ip;
            ipDropdown.add(option);
        });

        // Fetch the usernames
        const usernameRes = await axios.get('/api/usernames');
        console.log(usernameRes);
        const usernameDropdown = document.getElementById('usernameDropdown');
        usernameRes.data.forEach(user => {
            let option = document.createElement('option');
            option.value = user;
            option.text = user;
            usernameDropdown.add(option);
        });

    } catch (error) {
        console.error('Error fetching dropdown data:', error);
    }
}

// Function to handle the connect button click
async function connect() {
    const applicationDropdown = document.getElementById('applicationDropdown');
    const ipDropdown = document.getElementById('ipDropdown');
    const usernameDropdown = document.getElementById('usernameDropdown');

    const applicationName = applicationDropdown.value;
    const ipOrHostname = ipDropdown.value;
    const username = usernameDropdown.value;

    if (!applicationName || !ipOrHostname || !username) {
        alert("Please select all values from the dropdowns.");
        return;
    }

    try {
        // Send selected values to backend to execute the Python script
        const response = await axios.post('/api/connect', {
            applicationName: applicationName,
            ipOrHostname: ipOrHostname,
            username: username
        });

        // Handle success response from backend
        alert('Success: ' + response.data);

    } catch (error) {
        console.error('Error during connection:', error);
        alert('Error: ' + error.message);
    }
}
