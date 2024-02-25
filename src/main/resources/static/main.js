document.addEventListener('DOMContentLoaded', function() {
    const prevButton = document.querySelector('.prev-button');
    const nextButton = document.querySelector('.next-button');
    const carouselWrapper = document.querySelector('.carousel-wrapper');

    const totalItems = document.querySelectorAll('.carousel-item').length;
    let currentIndex = 0;

    function updateCarousel() {
        carouselWrapper.style.transform = `translateX(-${currentIndex * (100 / totalItems)}%)`;
    }

    prevButton.addEventListener('click', function() {
        currentIndex = (currentIndex === 0) ? totalItems - 1 : currentIndex - 1;
        updateCarousel();
    });

    nextButton.addEventListener('click', function() {
        currentIndex = (currentIndex === totalItems - 1) ? 0 : currentIndex + 1;
        updateCarousel();
    });
});
