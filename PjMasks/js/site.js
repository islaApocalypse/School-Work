
let heroHeader = document.querySelector('#heroHeader');
let villianHeader = document.querySelector('#villianHeader');
let heroImages = [ // hero header string
    'Bkg1.svg', 'Bkg2.svg', 'Bkg3.svg', 'Bkg4.svg'];
let villianImages = [ // villian header string
    'villianBkg1.svg', 'villianBkg2.svg', 'villianBkg3.svg', 'villianBkg4.svg'];
let heroHeaderTimer = setInterval('SwapHeroImage()', 4000); // swap image timer hero header
let villianHeaderTimer = setInterval('SwapVillianImage()', 4000); // swap image timer for villian header
let heroCounter = 0;// start point for hero image swap function
let villianCounter = 0;// start point for villian image swap function
let navOpen = false; // boolean statement

// swap images in the header background
function SwapHeroImage() {
    heroCounter++;
    if(heroCounter > 3) {
        heroCounter = 0;
    }
    heroHeader.setAttribute('style', 'background: url(Assets/Images/' +
        heroImages[heroCounter] + '); background-size: cover; background-position: 100%;');
}

// swap images in the villian header background
function SwapVillianImage() {
    villianCounter++;
    if(villianCounter > 3) {
        villianCounter = 0;
    }
    villianHeader.setAttribute('style', 'background: url(Assets/Images/' +
        villianImages[villianCounter] + '); background-size: cover; background-position: 100%;');
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