
// heros
let randCatPics = document.querySelector('#cat');
let randLizardPics = document.querySelector('#lizard');
let randOwlPics = document.querySelector('#owl');
let randRobotPics = document.querySelector('#robot');
// villians
let randLunaGirlPics = document.querySelector('.moths');
let randNinjaPics = document.querySelector('.ninjas');
let randRomeoPics = document.querySelector('.evilGenius');
let randWolfyPics = document.querySelector('.wolves');

// hero image strings
let gekkoBackgrounds = [ 
    'lizardImg1.jpg', 'lizardImg2.jpg', 'lizardImg3.jpg' 
];

let catBackgrounds = [
    'catImg1.jpg', 'catImg2.jpg', 'catImg3.jpg' 
];

let owlBackgrounds = [ 
    'owlImg1.jpg', 'owlImg2.jpg', 'owlImg3.jpg' 
];

let robotBackgrounds = [
    'pjRobotImg1.jpg', 'pjRobotImg2.jpg', 'pjRobotImg3.jpg'
];
// villian image strings
let lunaGirlBkgs = [
    'lunaGirl1.jpg', 'lunaGirl2.jpg', 'lunaGirl3.jpg'
];

let ninjaBackgrounds = [
    'nightNinja1.jpg', 'nightNinja2.jpg', 'nightNinja3.jpg'
];

let evilGeniusBkgs = [
    'romeoImg1.jpg', 'romeoImg2.jpg', 'romeoImg3.jpg'
];

let wolvesBkgs = [
    'wolfyKid1.jpg', 'wolfyKid2.jpg', 'wolfyKid3.jpg'
];

// hero random img function
let firstRandNum = Math.floor(Math.random() * gekkoBackgrounds.length);
let secondRandNum = Math.floor(Math.random() * catBackgrounds.length);
let thirdRandNum = Math.floor(Math.random() * owlBackgrounds.length);
let fourthRandNum = Math.floor(Math.random() * robotBackgrounds.length);
// villian random img function
let fifthRandNum = Math.floor(Math.random() * lunaGirlBkgs.length);
let sixthRandNum = Math.floor(Math.random() * ninjaBackgrounds.length);
let seventhRandNum = Math.floor(Math.random() * evilGeniusBkgs.length);
let eighthRandNum = Math.floor(Math.random() * wolvesBkgs.length);

// hero random Img + hero string = new pic on refreash/load
randLizardPics.setAttribute('style', 'background: url(Assets/Images/' + gekkoBackgrounds[firstRandNum] + ');');
randCatPics.setAttribute('style', 'background: url(Assets/Images/' + catBackgrounds[secondRandNum] + ');');
randOwlPics.setAttribute('style', 'background: url(Assets/Images/' + owlBackgrounds[thirdRandNum] + ');');
randRobotPics.setAttribute('style', 'background: url(Assets/Images/' + robotBackgrounds[fourthRandNum] + ');');
// villian random Img + villian string = new pic on refreash/load
randLunaGirlPics.setAttribute('style', 'background: url(Assets/Images/' + lunaGirlBkgs[fifthRandNum] + ');');
randNinjaPics.setAttribute('style', 'background: url(Assets/Images/' + ninjaBackgrounds[sixthRandNum] + ');');
randRomeoPics.setAttribute('style', 'background: url(Assets/Images/' + evilGeniusBkgs[seventhRandNum] + ');');
randWolfyPics.setAttribute('style', 'background: url(Assets/Images/' + wolvesBkgs[eighthRandNum] + ');');