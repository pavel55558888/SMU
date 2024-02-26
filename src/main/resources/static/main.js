document.addEventListener('DOMContentLoaded', function() {
    const prevButton = document.querySelector('.prev-button');
    const nextButton = document.querySelector('.next-button');
    const carouselWrapper = document.querySelector('.carousel-wrapper');

    const totalItems = document.querySelectorAll('.carousel-item').length;
    let currentIndex = 0;

    function updateCarousel() {
        carouselWrapper.style.transform = `translateX(-${currentIndex * (100 / totalItems)}%)`;
    }

    nextButton.addEventListener('click', function() {
        const carouselWidth = carouselWrapper.offsetWidth;
        const itemWidth = carouselWrapper.firstElementChild.offsetWidth;
        const itemsPerScroll = Math.floor(carouselWidth / itemWidth);

        currentIndex = (currentIndex + Math.ceil(itemsPerScroll / 4)) % totalItems; // Изменено на Math.ceil(itemsPerScroll / 2)
        updateCarousel();
    });

    prevButton.addEventListener('click', function() {
        currentIndex = (currentIndex - 1 + totalItems) % totalItems;
        updateCarousel();
    });

    function updateCarousel() {
        const carouselWidth = carouselWrapper.offsetWidth;
        const itemWidth = carouselWrapper.firstElementChild.offsetWidth;
        const itemsPerScroll = Math.floor(carouselWidth / itemWidth);

        const offset = -currentIndex * itemWidth;
        carouselWrapper.style.transform = `translateX(${offset}px)`;
    }

});

function isMobileDevice() {
    return (typeof window.orientation !== "undefined") || (navigator.userAgent.indexOf('IEMobile') !== -1);
}

function setScrollValues() {
    var scrollValues = {
        desktop: {
            specialEquipment: 1400,
            onlineRequest: 3100,
            contacts: 6000
        },
        mobile: {
            specialEquipment: 600,
            onlineRequest: 3400,
            contacts: 6000
        }
    };

    var scrollValue = isMobileDevice() ? scrollValues.mobile : scrollValues.desktop;

    document.querySelector('a:nth-child(1)').onclick = function() {
        window.scrollTo({ top: scrollValue.specialEquipment, behavior: 'smooth' });
    };

    document.querySelector('a:nth-child(2)').onclick = function() {
        window.scrollTo({ top: scrollValue.onlineRequest, behavior: 'smooth' });
    };

    document.querySelector('a:nth-child(3)').onclick = function() {
        window.scrollTo({ top: scrollValue.contacts, behavior: 'smooth' });
    };
}

window.onload = function() {
    setScrollValues();
};
