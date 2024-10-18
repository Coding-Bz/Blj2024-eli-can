gsap.registerPlugin(ScrollTrigger);

ScrollTrigger.defaults({
    toggleActions: "restart pause resume pause",
    scroller: ".container"
});
gsap.to(".orange p",{
    scrollTrigger:".orange",
    duration: 2,
    repeat:-1,
    rotation:360
});