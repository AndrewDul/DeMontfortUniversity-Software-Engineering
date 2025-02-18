// Form Validation
document
  .getElementById("contactForm")
  .addEventListener("submit", function (event) {
    event.preventDefault(); // Prevent form submission

    // Get form values
    const name = document.getElementById("name").value.trim();
    const email = document.getElementById("email").value.trim();
    const message = document.getElementById("message").value.trim();

    // Simple validation
    if (name === "" || email === "" || message === "") {
      alert("Please fill out all fields.");
    } else {
      alert("Form submitted successfully!");
      // Here you can add code to send the form data to a server
    }
  });
