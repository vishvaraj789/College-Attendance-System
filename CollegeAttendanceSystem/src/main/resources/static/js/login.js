document.getElementById("loginForm").addEventListener("submit", function (e) {
    e.preventDefault();

    const data = {
        username: document.getElementById("username").value.trim(),
        password: document.getElementById("password").value.trim(),
        role: document.getElementById("role").value
    };

    fetch("/auth/login", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    })
    .then(res => res.json())
    .then(response => {

        if (response.status === "SUCCESS") {
            if (response.role === "ADMIN") location.href = "/admin";
            if (response.role === "FACULTY") location.href = "/faculty";
            if (response.role === "STUDENT") location.href = "/student";
        } else {
            document.getElementById("errorMsg").innerText = response.message;
        }

    })
    .catch(() => {
        document.getElementById("errorMsg").innerText = "Server error";
    });
});
