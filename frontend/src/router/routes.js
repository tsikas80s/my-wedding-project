const routes = [
  {
    path: "/",
    component: () => import("layouts/MainLayout.vue"),
    children: [
      {
        path: "home",
        name: "HomePage",
        component: () => import("src/pages/HomePage.vue"),
        meta: { title: "Mariza & Dimitri's Wedding" },
      },
    ],
  },
  // 404
  {
    path: "/:catchAll(.*)*",
    component: () => import("pages/ErrorNotFound.vue"),
  },
];

export default routes;
