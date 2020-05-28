let botaoEl = document.querySelector('#sanduiche');
let navEl = document.querySelector('#navegacao');

function responsivoMenu (){
  navEl.classList.toggle('menuresponsivo');
  navEl.classList.toggle('nav2');

}

botaoEl.addEventListener('click', responsivoMenu);
