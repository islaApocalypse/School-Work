
(function () {
    let requestAnimationFrame = window.requestAnimationFrame
        || window.mozRequestAnimationFrame
        || window.webkitRequestAnimationFrame
        || window.msRequestAnimationFrame;
    window.requestAnimationFrame = requestAnimationFrame;
})();


const CANVAS_WIDTH = window.innerWidth;
const CANVAS_HEIGHT = window.innerHeight;
let canvas = document.querySelector('#canvas');
let ctx = canvas.getContext('2d');
canvas.width = CANVAS_WIDTH;
canvas.height = CANVAS_HEIGHT;

let jumpingPjs = [];
let MAX_PJS = 175;
for(let i = 0; i < MAX_PJS; i++) {
    let jumpingPj = new JumpingPj(CANVAS_WIDTH, CANVAS_HEIGHT);
    jumpingPjs.push(jumpingPj);
}

function Clear() {
    ctx.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
}
function Move() {
    for(let i = 0; i < jumpingPjs.length; i++) {
        jumpingPjs[i].Move();
        switch(jumpingPjs[i].direction) {
            case 0: { // right
                if(jumpingPjs[i].x > CANVAS_WIDTH + 100)
                jumpingPjs[i].Reset();
                break;
            }
            case 1: { // left
                if(jumpingPjs[i].x < -100)
                jumpingPjs[i].Reset();
                break;
            }
            case 2: { // up
                if(jumpingPjs[i].y < -100) {
                    jumpingPjs[i].Reset();
                }  
                break;
            }
            case 3: { // down
                if(jumpingPjs[i].y > CANVAS_HEIGHT + 100)
                jumpingPjs[i].Reset();
                break;
            }
        }
    }
 }
function Draw() { 
    for(let i = 0; i < jumpingPjs.length; i++) {
        jumpingPjs[i].Draw();
    }
}
function Update() {
    Clear();
    Move();
    Draw();
    requestAnimationFrame(Update);
}


window.addEventListener("load", function () {
    Update();
});