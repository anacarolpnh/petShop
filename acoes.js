function mostrarSubMenu() {
    var submenu = document.getElementById("submenu");
    if (submenu.style.display === "none") {
        submenu.style.display = "block";
    } else {
        submenu.style.display = "none";
    }
}

function mostrarGrid() {
    var grid = document.getElementById("grid");
    if (grid.style.display === "none") {
        grid.style.display = "grid";
    } else {
        grid.style.display = "none";
    }
}
