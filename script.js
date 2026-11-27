const nav = document.querySelector('.main-nav');
const menuButton = document.querySelector('.menu-toggle');
const photo = document.querySelector('#profile-photo');
const fallback = document.querySelector('#photo-fallback');

// Show the real portrait when assets/profile.jpg has been added.
photo.addEventListener('load', () => {
  photo.style.display = 'block';
  fallback.style.display = 'none';
});
photo.addEventListener('error', () => {
  photo.style.display = 'none';
  fallback.style.display = 'grid';
});

// Mobile navigation.
menuButton.addEventListener('click', () => {
  const open = nav.classList.toggle('open');
  menuButton.setAttribute('aria-expanded', String(open));
  menuButton.setAttribute('aria-label', open ? 'Close navigation' : 'Open navigation');
});
nav.querySelectorAll('a').forEach(link => {
  link.addEventListener('click', () => {
    nav.classList.remove('open');
    menuButton.setAttribute('aria-expanded', 'false');
    menuButton.setAttribute('aria-label', 'Open navigation');
  });
});

// Gentle reveal-on-scroll. Elements become visible once, then stop observing.
const revealItems = document.querySelectorAll('.reveal');
if ('IntersectionObserver' in window) {
  const observer = new IntersectionObserver(entries => {
    entries.forEach(entry => {
      if (entry.isIntersecting) {
        entry.target.classList.add('is-visible');
        observer.unobserve(entry.target);
      }
    });
  }, { threshold: 0.12 });
  revealItems.forEach(item => observer.observe(item));
} else {
  revealItems.forEach(item => item.classList.add('is-visible'));
}

// Set the footer year automatically.
document.querySelector('#year').textContent = new Date().getFullYear();
