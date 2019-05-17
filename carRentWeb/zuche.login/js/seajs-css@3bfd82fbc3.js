/*! Copyright@2008-2017 zuche.com All Rights Reserved.2019-04-24 */
!
function() {
    function a(a) {
        return function(b) {
            return {}.toString.call(b) == "[object " + a + "]"
        }
    }
    function b(a) {
        return "[object Function]" == {}.toString.call(a)
    }
    function c(a, c, e) {
        var f = u.test(a),
        g = r.createElement(f ? "link": "script");
        if (e) {
            var h = b(e) ? e(a) : e;
            h && (g.charset = h)
        }
        d(g, c, f, a),
        f ? (g.rel = "stylesheet", g.href = a) : (g.async = !0, g.src = a),
        p = g,
        t ? s.insertBefore(g, t) : s.appendChild(g),
        p = null
    }
    function d(a, b, c, d) {
        function f() {
            a.onload = a.onerror = a.onreadystatechange = null,
            c || seajs.data.debug || s.removeChild(a),
            a = null,
            b()
        }
        var g = "onload" in a;
        return ! c || !v && g ? void(g ? (a.onload = f, a.onerror = function() {
            seajs.emit("error", {
                uri: d,
                node: a
            }),
            f()
        }) : a.onreadystatechange = function() { / loaded | complete / .test(a.readyState) && f()
        }) : void setTimeout(function() {
            e(a, b)
        },
        1)
    }
    function e(a, b) {
        var c, d = a.sheet;
        if (v) d && (c = !0);
        else if (d) try {
            d.cssRules && (c = !0)
        } catch(f) {
            "NS_ERROR_DOM_SECURITY_ERR" === f.name && (c = !0)
        }
        setTimeout(function() {
            c ? b() : e(a, b)
        },
        20)
    }
    function f(a) {
        return a.match(x)[0]
    }
    function g(a) {
        for (a = a.replace(y, "/"), a = a.replace(A, "$1/"); a.match(z);) a = a.replace(z, "/");
        return a
    }
    function h(a) {
        var b = a.length - 1,
        c = a.charAt(b);
        return "#" === c ? a.substring(0, b) : ".js" === a.substring(b - 2) || a.indexOf("?") > 0 || ".css" === a.substring(b - 3) || "/" === c ? a: a + ".js"
    }
    function i(a) {
        var b = w.alias;
        return b && q(b[a]) ? b[a] : a
    }
    function j(a) {
        var b, c = w.paths;
        return c && (b = a.match(B)) && q(c[b[1]]) && (a = c[b[1]] + b[2]),
        a
    }
    function k(a) {
        var b = w.vars;
        return b && a.indexOf("{") > -1 && (a = a.replace(C,
        function(a, c) {
            return q(b[c]) ? b[c] : a
        })),
        a
    }
    function l(a) {
        var c = w.map,
        d = a;
        if (c) for (var e = 0,
        f = c.length; f > e; e++) {
            var g = c[e];
            if ((d = b(g) ? g(a) || a: a.replace(g[0], g[1])) !== a) break
        }
        return d
    }
    function m(a, b) {
        var c, d = a.charAt(0);
        if (D.test(a)) c = a;
        else if ("." === d) c = g((b ? f(b) : w.cwd) + a);
        else if ("/" === d) {
            var e = w.cwd.match(E);
            c = e ? e[0] + a.substring(1) : a
        } else c = w.base + a;
        return 0 === c.indexOf("//") && (c = location.protocol + c),
        c
    }
    function n(a, b) {
        if (!a) return "";
        a = i(a),
        a = j(a),
        a = k(a),
        a = h(a);
        var c = m(a, b);
        return c = l(c)
    }
    function o(a) {
        return a.hasAttribute ? a.src: a.getAttribute("src", 4)
    }
    var p, q = a("String"),
    r = document,
    s = r.head || r.getElementsByTagName("head")[0] || r.documentElement,
    t = s.getElementsByTagName("base")[0],
    u = /\.css(?:\?|$)/i,
    v = +navigator.userAgent.replace(/.*(?:AppleWebKit|AndroidWebKit)\/?(\d+).*/i, "$1") < 536;
    seajs.request = c;
    var w = seajs.data,
    x = /[^?#]*\//,
    y = /\/\.\//g,
    z = /\/[^\/]+\/\.\.\//,
    A = /([^:\/])\/+\//g,
    B = /^([^\/:]+)(\/.+)$/,
    C = /{([^{]+)}/g,
    D = /^\/\/.|:\//,
    E = /^.*?\/\/.*?\//,
    r = document,
    F = location.href && 0 !== location.href.indexOf("about:") ? f(location.href) : "",
    G = r.scripts;
    f(o(r.getElementById("seajsnode") || G[G.length - 1]) || F),
    seajs.resolve = n,
    define("seajs/seajs-css/1.0.4/seajs-css", [], {})
} ();