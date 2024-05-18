document.addEventListener('DOMContentLoaded', (event) => {
    const spinButton = document.getElementById('spinButton');
    const ruleta = document.getElementById('ruleta');

    spinButton.addEventListener('click', () => {
        console.log('Tlačítko bylo kliknuto'); // Pro debugování
        ruleta.classList.remove('spin'); // Pokud se již otáčí, zastav animaci
        void ruleta.offsetWidth; // Vynulování animace
        ruleta.classList.add('spin'); // Spuštění animace
    });
});

