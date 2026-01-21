document.getElementById("loginForm").addEventListener("submit", function (e) {
    e.preventDefault();

    const username = document.getElementById("username").value.trim();
    const password = document.getElementById("password").value.trim();
    const role = document.getElementById("role").value;
    const errorMsg = document.getElementById("errorMsg");

    errorMsg.textContent = "";

    if (!username || !password || !role) {
        errorMsg.textContent = "All fields are required!";
        return;
    }

    // Demo only (backend will replace this)
    if (username === "admin" && password === "admin123" && role === "ADMIN") {
        window.location.href = "admin";
    }else if(username === "faculty" && password === "faculty123" && role === "FACULTY"){
		window.location.href = "faculty";
	}else if(username === "student" && password === "student123" && role === "STUDENT"){
		window.location.href = "student";
	}else {
        errorMsg.textContent = "Invalid credentials";
    }
});
