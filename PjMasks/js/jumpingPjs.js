
class JumpingPj {
    constructor(CanvasWidth, CanvasHeight) {
        this.CanvasWidth = CanvasWidth,
        this.CanvasHeight = CanvasHeight,
        this.radius = Math.floor(Math.random() * 15) + 10,
        this.x = Math.floor(Math.random() * CanvasWidth),
        this.y = Math.floor(Math.random() * CanvasHeight),
        this.imgs = [ './assets/images/catImg.png', './assets/images/lizardImg.png', './assets/images/owlImg.png', './assets/images/pjRobotImg.png', './assets/images/lunaGirl.png', './assets/images/nightNinja.png', './assets/images/romeoImg.png', './assets/images/wolfyKids.png', './assets/images/sweetPeaImg.png' ],
        this.img = new Image;
        this.img.src = this.imgs[Math.floor(Math.random() * this.imgs.length)]
        this.velocity = Math.ceil(Math.random() * 10) + 1,
        this.direction = Math.floor(Math.random() * 4)
    }
    
    Move() {
        switch(this.direction) {
            case 0: { // right
                this.x += this.velocity;
                break;
            }
            case 1: { // left
                this.x -= this.velocity;
                break;
            }
            case 2: { // up
                this.y -= this.velocity;
                break;
            }
            case 3: { // down
                this.y += this.velocity;
                break;
            }
        }
    }
    Draw() {
        ctx.drawImage(this.img, this.x, this.y)
    }
    Reset() {
        this.img.src = this.imgs[Math.floor(Math.random() * this.imgs.length)];
        this.velocity = Math.ceil(Math.random() * 10) + 1;
        this.radius = Math.floor(Math.random() * 15) + 10;
        this.direction = Math.floor(Math.random() * 4);
        switch(this.direction) {
            case 0: { // right
                this.x = -100;
                this.y = Math.floor(Math.random() * this.CanvasHeight);
                break;
            }
            case 1: { // left
                this.x = this.CanvasWidth + 100;
                this.y = Math.floor(Math.random() * this.CanvasHeight);
                break;
            }
            case 2: { // up
                this.x = Math.floor(Math.random() * this.CanvasWidth);
                this.y = this.CanvasHeight + 100;
                break;
            }
            case 3: { // down
                this.x = Math.floor(Math.random() * this.CanvasWidth);
                this.y = -100;
                break;
            }
        }
    }
}