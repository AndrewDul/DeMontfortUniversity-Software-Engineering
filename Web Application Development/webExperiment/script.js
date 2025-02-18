const btn = document.getElementById("my-btn");
const output = document.getElementById("output");

function insertParagraph() {
  const element = document.createElement("p");
  element.className = "magicParagraph";
  element.textContent = "You clicked the button! Here's some magic for you!";
  //element.style.backgroundColor = "#ffff99";
  element.style.padding = "10px";
  element.style.borderRadius = "5px";
  element.style.boxShadow = "0 4px 8px rgba(0, 0, 0, 0.2)";
  output.append(element);
}

btn.addEventListener("click", insertParagraph);
