/* Dumb helpers */

function rgbToHex(r, g, b) {
  return "#" + componentToHex(r) + componentToHex(g) + componentToHex(b);
}

function componentToHex(c) {
  var hex = c.toString(16);
  return hex.length == 1 ? "0" + hex : hex;
}

/* Ends here */

g = 4; // TODO
var k = {
  g: 0,
};

var SKIN_COLORS = [];
WIDTH = 500;
HEIGHT = 500;

function drawOnScreenSelection(ctx, x, y, w, h, disabled) {
  ctx.save();
  ctx.fillStyle = disabled ? "#FFFFFF" : "#E6D8C7";
  ctx.fillRect(x + 2, y + 2, w - 3, h - 3);
  ctx.strokeStyle = "#5C5C5C";
  ctx.strokeRect(x, y, w - 1, h);
  ctx.strokeStyle = "#FFFFFF";
  ctx.beginPath();
  ctx.moveTo(x + 1, y + 1);
  ctx.lineTo(x + w - 2 + g, y + 1);
  ctx.stroke();
  ctx.beginPath();
  ctx.moveTo(x + 1, y + 2);
  ctx.lineTo(x + 1, y + h - 1);
  ctx.stroke();
  ctx.strokeStyle = "#CEBAA8";
  ctx.beginPath();
  ctx.moveTo(x + 2, y + h - 1);
  ctx.lineTo(x + w - 2 + g, y + h - 1);
  ctx.stroke();
  ctx.beginPath();
  ctx.moveTo(x + w - 2, y + 2);
  ctx.lineTo(x + w - 2, y + h - 1);
  ctx.stroke();
  ctx.restore();
}

function drawFocus(ctx, x, y, w, h) {
  ctx.save();
  ctx.strokeStyle = SKIN_COLORS[13];
  ctx.beginPath();
  ctx.moveTo(x - 2, y - 2);
  ctx.lineTo(x - 2, y + h + 1);
  ctx.moveTo(x - 2, y + h + 1);
  ctx.lineTo(x + w + 1, y + h + 1);
  ctx.moveTo(x + w + 1, y + h + 1);
  ctx.lineTo(x + w + 1, y - 2);
  ctx.moveTo(x + w + 1, y - 2);
  ctx.lineTo(x - 2, y - 2);
  ctx.moveTo(x + w, y + h);
  ctx.lineTo(x - 1, y + h);
  ctx.moveTo(x + w, y + h);
  ctx.lineTo(x + w, y - 1);
  ctx.strokeStyle = SKIN_COLORS[14];
  ctx.moveTo(x - 2, y + h);
  ctx.lineTo(x - 2, y - 1);
  ctx.moveTo(x - 1, y - 2);
  ctx.lineTo(x + w + 1, y - 2);
  ctx.strokeStyle = SKIN_COLORS[15];
  ctx.moveTo(x - 1, y + h + 1);
  ctx.lineTo(x + w + 1, y + h + 1);
  ctx.moveTo(x + w + 1, y + h);
  ctx.lineTo(x + w + 1, y - 1);
  ctx.moveTo(x - 1, y + h - 1);
  ctx.lineTo(x - 1, y - 1);
  ctx.moveTo(x, y - 1);
  ctx.lineTo(x + w + g, y - 1);
  ctx.stroke();
  ctx.restore();
}

function makeGradient(ctx, x1, y1, width, height, color1, color2) {
  ctx.save();
  var r1 = (color1 >> 16) & 0xff;
  var g1 = (color1 >> 8) & 0xff;
  var b1 = color1 & 0xff;
  var r2 = (color2 >> 16) & 0xff;
  var g2 = (color2 >> 8) & 0xff;
  var b2 = color2 & 0xff;
  r1 <<= 8;
  g1 <<= 8;
  b1 <<= 8;
  r2 <<= 8;
  g2 <<= 8;
  b2 <<= 8;
  var dr = (r2 - r1) / height;
  var dg = (g2 - g1) / height;
  var db = (b2 - b1) / height;
  var x2 = x1 + width - 1;
  var y2 = y1 + height - 1;

  for (var y = y1; y < y2; ++y) {
    ctx.strokeStyle =
      "rgb(" + (r1 >> 8) + "," + (g1 >> 8) + "," + (b1 >> 8) + ")";
    ctx.beginPath();
    ctx.moveTo(x1, y);
    ctx.lineTo(x2, y);
    ctx.stroke();
    r1 += dr;
    g1 += dg;
    b1 += db;
  }
  ctx.restore();
}

function drawRectangleWithImage(ctx, fillColor, x, y, width, height, image) {
  ctx.save();
  ctx.fillStyle = fillColor;
  ctx.fillRect(x, y, width, height);
  ctx.strokeStyle = "#6052956";

  if (image !== null) {
    ctx.drawImage(image, x + 3, y + height / 2 + 1);
    // ctx.drawImage(image, x + 3, y + height / 2 + 1, 6);
  }

  ctx.strokeRect(x, y, width, height);
  ctx.strokeStyle = "#13684944";
  ctx.beginPath();
  ctx.moveTo(x + 1, y + 1);
  ctx.lineTo(x + width - 1, y + 1);
  ctx.stroke();
  ctx.beginPath();
  ctx.moveTo(x + 1, y + 2);
  ctx.lineTo(x + 1, y + height - 1);
  ctx.stroke();
  ctx.restore();
}

// Helper
function drawLine(ctx, color, x1, y1, x2, y2) {
  ctx.save();
  ctx.beginPath();
  ctx.strokeStyle = color;
  ctx.moveTo(x1, y1);
  ctx.lineTo(x2, y2);
  ctx.stroke();
  ctx.restore();
}

function drawProgressBar(ctx, thus) {
  if (
    thus.pageImageData != null &&
    thus.pageImageData.width > thus.height &&
    thus.pageImageData.width > 0
  ) {
    thus.isVisible = true;
    var oldColor = ctx.strokeStyle;
    var oldClipX = ctx.clipX || 0; // TODO
    var oldClipY = ctx.clipY || 0; // TODO
    var barLength = thus.height;
    var barLeft = Math.max(oldClipX, thus.width + thus.x - 6);
    var barTop = Math.max(oldClipY, thus.y);
    var barHeight = barLength - 2;
    var barWidth =
      (((1024 * barLength) / thus.pageImageData.width) * barHeight) / 1024 + 3;
    var barOffset;

    if (Math.abs(thus.offset) + thus.height >= thus.pageImageData.width) {
      barOffset = barHeight - barWidth + 1;
    } else {
      barOffset = Math.min(
        (((1024 * Math.abs(thus.offset)) / thus.pageImageData.width) *
          barLength) /
          1024,
        barHeight - barWidth + 1
      );
    }

    ctx.strokeStyle = SKIN_COLORS[16];
    drawLine(
      ctx,
      SKIN_COLORS[16],
      barLeft,
      barTop,
      barLeft,
      barTop + barLength - 1
    );
    drawLine(
      ctx,
      SKIN_COLORS[16],
      barLeft + 6 - 1,
      barTop,
      barLeft + 6 - 1,
      barTop + barLength - 1
    );

    var colors = [
      SKIN_COLORS[21],
      SKIN_COLORS[22],
      SKIN_COLORS[23],
      SKIN_COLORS[24],
    ];
    for (var i = 0; i < 4; i++) {
      ctx.strokeStyle = colors[i];
      drawLine(
        ctx,
        colors[i],
        barLeft + 1 + i,
        barTop,
        barLeft + 1 + i,
        barTop + barLength - 1
      );
    }

    var barLeftOffset = barLeft + 1;
    var barTopOffset = barOffset + thus.y;
    var barRightOffset = barLeftOffset + 3;
    var barBottomOffset = barOffset + thus.y + Math.max(barWidth, 4);
    ctx.strokeStyle = SKIN_COLORS[16];
    drawLine(
      ctx,
      SKIN_COLORS[16],
      barLeftOffset - 1,
      barTopOffset,
      barRightOffset + 1,
      barTopOffset
    );
    drawLine(
      ctx,
      SKIN_COLORS[16],
      barLeftOffset - 1,
      barBottomOffset,
      barRightOffset + 1,
      barBottomOffset
    );
    ctx.strokeStyle = SKIN_COLORS[17];
    drawLine(
      ctx,
      SKIN_COLORS[17],
      barLeftOffset,
      barTopOffset + 1,
      barLeftOffset,
      barBottomOffset - 1
    );
    drawLine(
      ctx,
      SKIN_COLORS[17],
      barLeftOffset,
      barTopOffset + 1,
      barRightOffset,
      barTopOffset + 1
    );
    ctx.strokeStyle = SKIN_COLORS[18];
    drawLine(
      ctx,
      SKIN_COLORS[18],
      barLeftOffset + 1,
      barBottomOffset - 1,
      barRightOffset,
      barBottomOffset - 1
    );
    drawLine(
      ctx,
      SKIN_COLORS[18],
      barRightOffset,
      barBottomOffset - 1,
      barRightOffset,
      barTopOffset + 2
    );
    ctx.strokeStyle = SKIN_COLORS[19];
    drawLine(
      ctx,
      SKIN_COLORS[19],
      barLeftOffset + 1,
      barTopOffset + 2,
      barLeftOffset + 1,
      barBottomOffset - 2
    );
    drawLine(
      ctx,
      SKIN_COLORS[19],
      barLeftOffset + 1,
      barTopOffset + 2,
      barLeftOffset + 2 + k.g,
      barTopOffset + 2
    );
    ctx.strokeStyle = SKIN_COLORS[20];
    drawLine(
      ctx,
      SKIN_COLORS[19],
      barLeftOffset + 2,
      barTopOffset + 3,
      barLeftOffset + 2,
      barBottomOffset - 2
    );
    ctx.strokeStyle = oldColor;
    thus.C = barWidth;
    thus.D = barOffset;
  } else {
    thus.f = false;
  }
}

var opera_mini_logo_image = new Image();
opera_mini_logo_image.src = "assets/om100.png";

var skin_img = new Image();
skin_img.src = "assets/skin.png";

var languages_map;
const languages_map_prom = async function () {
  const response = await fetch("assets/languages_map");
  languages_map = await response.arrayBuffer();
};

async function init() {
  // Créer un canvas temporaire
  var canvas = document.createElement("canvas");
  canvas.width = skin_img.width;
  canvas.height = skin_img.height;
  var ctx = canvas.getContext("2d");

  // Dessiner l'image sur le canvas
  ctx.drawImage(skin_img, 0, 0);

  // Créer un tableau pour stocker les couleurs
  var colors = [];

  // Boucler sur les pixels de la dernière ligne
  for (var x = 0; x < skin_img.width; x++) {
    var pixelData = ctx.getImageData(x, skin_img.height - 1, 1, 1).data;
    var color = rgbToHex(pixelData[0], pixelData[1], pixelData[2]);
    colors.push(color);
  }

  // Afficher le tableau de couleurs
  SKIN_COLORS = colors;

  console.log(languages_map);

  main();
}

(async () => {
  await Promise.all([skin_img.onload, opera_mini_logo_image.onload]);
  await languages_map_prom();

  await init();
})();

// Promise.all([
//   skin_img.onload,
//   opera_mini_logo_image.onload,
//   languages_map_prom,
// ]).then(() => {});

function main() {
  // Exemple d'utilisation
  var canvas = document.getElementById("myCanvas");
  var ctx = canvas.getContext("2d");

  drawOnScreenSelection(ctx, 350, 50, 100, 100, true);
  drawFocus(ctx, 350, 200, 100, 100);
  makeGradient(ctx, 350, 10, 50, 100, 0xff0000, 0x00ff00);

  // const image = new Image();
  // image.src = "assets/defaultfavicon.png";

  // image.onload = function () {
  //   drawRectangleWithImage(ctx, "#ff0000", 180, 50, 128, 110, image);
  // };

  paint(ctx);

  testFont(ctx);
}

/**
 *
 * @param {Graphics} graphics
 */
function draw_splash(graphics) {
  graphics.setColor(0xffffff);
  graphics.fillRect(
    graphics.getClipX(),
    graphics.getClipY(),
    graphics.getClipWidth(),
    graphics.getClipHeight()
  );
  graphics.drawImage(opera_mini_logo_image, WIDTH / 2, HEIGHT / 2, 3);
  graphics.setColor(0);
  a = DrawingUtils.get_string_resource(56);
  width = WIDTH / 2 - /* DrawingUtils.m56a(font, a, true) */ 11 / 2;
  graphics.drawString(
    a,
    width,
    HEIGHT - 20 + /* DrawingUtils.m73a(font, true) */ 11,
    36
  );
}

function paint(ctx) {
  let g = new Graphics(ctx);
  let w = new WindowApp();
  let s = new SearchUI();

  s.window.pageImageData.f498i = true; // debug test
  skin_colors = SKIN_COLORS;

  draw_splash(g);

  // s.paint(g);

  // w.paint(g);
}

async function testFont(ctx) {
  //   new BitmapFont().init(false).then((font) => {
  // text = "hello";
  // font.m1a(text, 0, text.length);
  // font.mo1a(text);
  // let i2 = font.fontHeight;
  // font.m2a(graphics(ctx), "A", 255, i2);
  //   });
}
