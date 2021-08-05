
let heroHeader = document.querySelector('#heroHeader');
let heroImages = [ // hero header string
    'Bkg1.svg', 'Bkg2.svg', 'Bkg3.svg', 'Bkg4.svg'];
let heroHeaderTimer = setInterval('SwapHeroImage()', 4000); // swap image timer hero header
let heroCounter = 0;// start point for hero image swap function
let navOpen = false; // boolean statement

function SwapHeroImage() {
    heroCounter++;
    if(heroCounter > 3) {
        heroCounter = 0;
    }
    heroHeader.setAttribute('style', 'background: url(Assets/Images/' +
        heroImages[heroCounter] + '); background-size: cover; background-position: 100%;');
}

// Toggle nav from right hand side
// function grabbed from jQuery libary
function HiddenNav() {
    if(navOpen === true) {
        $('nav').animate({
            right: -200
        }, 420, 'swing');
        navOpen = false;
    }
    else {
        $('nav').animate({
            right: 0
        }, 420, 'swing');
        navOpen = true;
    }
}
